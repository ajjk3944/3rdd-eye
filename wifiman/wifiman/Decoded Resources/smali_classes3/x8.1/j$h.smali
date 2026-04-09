.class final Lx8/j$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$h;

    invoke-direct {v0}, Lx8/j$h;-><init>()V

    sput-object v0, Lx8/j$h;->a:Lx8/j$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/ui/signal/strength/a;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ubnt/usurvey/ui/signal/strength/a;->d()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/ui/signal/strength/a;

    invoke-virtual {p0, p1}, Lx8/j$h;->a(Lcom/ubnt/usurvey/ui/signal/strength/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
