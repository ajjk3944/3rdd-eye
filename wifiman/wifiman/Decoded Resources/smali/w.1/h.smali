.class public final Lw/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/n;


# instance fields
.field private a:Lr/z;

.field private final b:Lf0/g;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/z;Lf0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/h;->a:Lr/z;

    .line 3
    iput-object p2, p0, Lw/h;->b:Lf0/g;

    return-void
.end method

.method public synthetic constructor <init>(Lr/z;Lf0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->e()Lf0/g;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lw/h;-><init>(Lr/z;Lf0/g;)V

    return-void
.end method


# virtual methods
.method public a(Lw/v;FLdh/e;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lw/h;->c:I

    iget-object v0, p0, Lw/h;->b:Lf0/g;

    new-instance v1, Lw/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lw/h$a;-><init>(FLw/h;Lw/v;Ldh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()Lr/z;
    .locals 1

    iget-object v0, p0, Lw/h;->a:Lr/z;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lw/h;->c:I

    return v0
.end method

.method public final f(Lr/z;)V
    .locals 0

    iput-object p1, p0, Lw/h;->a:Lr/z;

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lw/h;->c:I

    return-void
.end method
