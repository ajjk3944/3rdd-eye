.class final Lmc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmc/b;-><init>(Landroid/content/res/Resources;Landroid/content/Context;Lcom/ui/wifiman/model/vendor/d$b;Lld/b;LNd/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lmc/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmc/b$a;

    invoke-direct {v0}, Lmc/b$a;-><init>()V

    sput-object v0, Lmc/b$a;->a:Lmc/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmc/b$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lmc/b$a$a;-><init>(Lcom/ui/sso/api/UiAccountApi;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lmc/b$a;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
