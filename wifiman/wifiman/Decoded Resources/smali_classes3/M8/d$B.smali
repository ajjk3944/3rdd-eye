.class final LM8/d$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$B;

    invoke-direct {v0}, LM8/d$B;-><init>()V

    sput-object v0, LM8/d$B;->a:LM8/d$B;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LS8/e;)Ls9/d;
    .locals 2

    const-string/jumbo v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$b;

    invoke-virtual {p1}, LS8/e;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const v1, 0x7f1103e3

    invoke-direct {v0, v1, p1}, Ls9/d$b;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/e;

    invoke-virtual {p0, p1}, LM8/d$B;->a(LS8/e;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
