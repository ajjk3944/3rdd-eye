.class final LN/t0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/t0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/t0$f;

    invoke-direct {v0}, LN/t0$f;-><init>()V

    sput-object v0, LN/t0$f;->a:LN/t0$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/T$b;)V
    .locals 2

    const/16 v0, 0x534

    invoke-virtual {p1, v0}, Lr/U;->d(I)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x29a

    invoke-virtual {p1, v0, v1}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    move-result-object v0

    invoke-static {}, LN/t0;->q()Lr/x;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lr/U;->e(Lr/S;Lr/E;)Lr/S;

    const/high16 v0, 0x43910000    # 290.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1}, Lr/U;->b()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/T$b;

    invoke-virtual {p0, p1}, LN/t0$f;->a(Lr/T$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
