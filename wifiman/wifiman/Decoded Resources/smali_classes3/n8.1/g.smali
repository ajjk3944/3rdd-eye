.class public final Ln8/g;
.super Ln8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/g$a;
    }
.end annotation


# instance fields
.field private final S:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 2

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln8/g$a;

    invoke-direct {v0, p1}, Ln8/g$a;-><init>(Lorg/kodein/di/DI;)V

    invoke-direct {p0, p1, v0}, Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V

    new-instance p1, Ll9/a;

    new-instance v0, Ls9/d$b;

    const v1, 0x7f1100b2

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/g;->S:Lgg/i;

    return-void
.end method


# virtual methods
.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/g;->S:Lgg/i;

    return-object v0
.end method
