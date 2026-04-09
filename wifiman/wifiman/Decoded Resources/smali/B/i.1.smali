.class public final LB/i;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/p0;


# instance fields
.field private n:Lr/H;

.field private o:Lr/H;

.field private p:Lr/H;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/H;Lr/H;Lr/H;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, LB/i;->n:Lr/H;

    iput-object p2, p0, LB/i;->o:Lr/H;

    iput-object p3, p0, LB/i;->p:Lr/H;

    return-void
.end method


# virtual methods
.method public final D2()Lr/H;
    .locals 1

    iget-object v0, p0, LB/i;->n:Lr/H;

    return-object v0
.end method

.method public final E2()Lr/H;
    .locals 1

    iget-object v0, p0, LB/i;->p:Lr/H;

    return-object v0
.end method

.method public final F2()Lr/H;
    .locals 1

    iget-object v0, p0, LB/i;->o:Lr/H;

    return-object v0
.end method

.method public final G2(Lr/H;)V
    .locals 0

    iput-object p1, p0, LB/i;->n:Lr/H;

    return-void
.end method

.method public final H2(Lr/H;)V
    .locals 0

    iput-object p1, p0, LB/i;->p:Lr/H;

    return-void
.end method

.method public final I2(Lr/H;)V
    .locals 0

    iput-object p1, p0, LB/i;->o:Lr/H;

    return-void
.end method

.method public M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
