.class final Lxd/d$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d;->j(Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lxd/d$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd/d$g;

    invoke-direct {v0}, Lxd/d$g;-><init>()V

    sput-object v0, Lxd/d$g;->a:Lxd/d$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/a;)LIa/a$b;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/usurvey/a;->l()LIa/a$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-virtual {p0, p1}, Lxd/d$g;->a(Lcom/ubnt/usurvey/a;)LIa/a$b;

    move-result-object p1

    return-object p1
.end method
