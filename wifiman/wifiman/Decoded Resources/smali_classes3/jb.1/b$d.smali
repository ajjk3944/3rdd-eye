.class final Ljb/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/b;->m()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljb/b;


# direct methods
.method constructor <init>(Ljb/b;)V
    .locals 0

    iput-object p1, p0, Ljb/b$d;->a:Ljb/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/o;)Ljb/g;
    .locals 10

    const-string/jumbo v0, "unifiCloudAccess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->f(Ljb/b;)Lcb/a;

    move-result-object v2

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->c(Ljb/b;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->d(Ljb/b;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->j(Ljb/b;)LGb/f;

    move-result-object v6

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->h(Ljb/b;)Lwb/a;

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->g(Ljb/b;)Lokhttp3/logging/HttpLoggingInterceptor$Level;

    move-result-object v9

    iget-object v0, p0, Ljb/b$d;->a:Ljb/b;

    invoke-static {v0}, Ljb/b;->k(Ljb/b;)LCb/a;

    move-result-object v8

    new-instance v0, Ljb/g;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Ljb/g;-><init>(Lcb/a;Llb/o;Ljava/lang/String;Ljava/lang/String;LGb/f;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/o;

    invoke-virtual {p0, p1}, Ljb/b$d;->a(Llb/o;)Ljb/g;

    move-result-object p1

    return-object p1
.end method
