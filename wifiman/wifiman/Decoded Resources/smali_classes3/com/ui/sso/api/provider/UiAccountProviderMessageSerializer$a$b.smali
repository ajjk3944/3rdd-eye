.class final Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;-><init>(Lth/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Laj/e;)V
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Laj/e;->f(Z)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj/e;->e(Z)V

    const-string/jumbo v0, "type"

    invoke-virtual {p1, v0}, Laj/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laj/e;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;->a(Laj/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
