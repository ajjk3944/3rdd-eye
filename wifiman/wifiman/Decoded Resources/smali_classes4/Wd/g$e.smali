.class final LWd/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWd/g;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;Lfd/b;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LWd/g$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LWd/g$e;

    invoke-direct {v0}, LWd/g$e;-><init>()V

    sput-object v0, LWd/g$e;->a:LWd/g$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/a;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/usurvey/a;->t()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-virtual {p0, p1}, LWd/g$e;->a(Lcom/ubnt/usurvey/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
