.class final Lcom/ui/sso/api/a$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->a(LIi/N;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/sso/api/a$f;

    invoke-direct {v0}, Lcom/ui/sso/api/a$f;-><init>()V

    sput-object v0, Lcom/ui/sso/api/a$f;->a:Lcom/ui/sso/api/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lcom/ui/sso/api/UiAccountApi$c;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/a$f;->a(Lcom/ui/sso/api/UiAccountApi;)Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    return-object p1
.end method
