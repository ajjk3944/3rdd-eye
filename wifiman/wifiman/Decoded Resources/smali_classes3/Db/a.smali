.class public final LDb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDb/a$a;
    }
.end annotation


# static fields
.field public static final c:LDb/a$a;


# instance fields
.field private final a:LGb/f;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDb/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDb/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDb/a;->c:LDb/a$a;

    return-void
.end method

.method public constructor <init>(LAb/h;LGb/f;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LDb/a;->a:LGb/f;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, LAb/h;->getUbicAuthCookieName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LDb/a;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LAb/h;LGb/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, LDb/a;-><init>(LAb/h;LGb/f;)V

    return-void
.end method


# virtual methods
.method public a(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4

    const-string/jumbo v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->i()Lokhttp3/Request$Builder;

    move-result-object v0

    sget-object v1, LDb/a;->c:LDb/a$a;

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v2

    invoke-static {v1, v2}, LDb/a$a;->c(LDb/a$a;Lokhttp3/Request;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LDb/a;->a:LGb/f;

    invoke-interface {v2}, LGb/f;->s()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0, v2}, LDb/a$a;->d(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v2

    invoke-static {v1, v2}, LDb/a$a;->b(LDb/a$a;Lokhttp3/Request;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1, v2}, LDb/a$a;->a(LDb/a$a;Lokhttp3/Request;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    iget-object v2, p0, LDb/a;->a:LGb/f;

    invoke-interface {v2}, LGb/f;->z()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v0, v2}, Lyb/a;->a(Lokhttp3/Request$Builder;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_2
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    iget-object v0, p0, LDb/a;->b:Ljava/lang/String;

    iget-object v2, p0, LDb/a;->a:LGb/f;

    invoke-virtual {v1, v0, v2, p1}, LDb/a$a;->l(Ljava/lang/String;LGb/f;Lokhttp3/Response;)V

    return-object p1
.end method
