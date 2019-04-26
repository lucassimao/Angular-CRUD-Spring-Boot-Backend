import { Injectable } from "@angular/core";
import { environment } from "../../environments/environment";
import { Advogado } from "./advogado";
import { HttpClient, HttpHeaders, HttpParams, HttpResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { ResultadoPaginado } from "./cadastro/resultado.paginado";

@Injectable({
  providedIn: "root"
})
export class AdvogadoService {
  constructor(private http: HttpClient) {}

  salvar(advogado: Advogado): Observable<any> {
    if ("id" in advogado && advogado.id > 0) {
      return this.http.put<void>(`${environment.backend}/advogados/${advogado.id}`, advogado, {
        observe: "response"
      });
    } else {
      return this.http.post<void>(`${environment.backend}/advogados`, advogado, {
        observe: "response"
      });
    }
  }

  listar(pagina: number, tamanhoPagina: number): Observable<ResultadoPaginado> {
    return this.http.get<ResultadoPaginado>(
      `${environment.backend}/advogados?page=${pagina}&size=${tamanhoPagina}&sort=id,desc`
    );
  }

  excluir(advogado: Advogado): Observable<void> {
    return this.http.delete<void>(`${environment.backend}/advogados/${advogado.id}`);
  }
}
