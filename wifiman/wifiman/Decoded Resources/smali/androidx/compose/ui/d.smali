.class public final Landroidx/compose/ui/d;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"


# instance fields
.field private n:LT/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/x;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/d;->n:LT/x;

    return-void
.end method


# virtual methods
.method public final D2(LT/x;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/ui/d;->n:LT/x;

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->l(LT/x;)V

    return-void
.end method

.method public n2()V
    .locals 2

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/d;->n:LT/x;

    invoke-virtual {v0, v1}, LE0/G;->l(LT/x;)V

    return-void
.end method
