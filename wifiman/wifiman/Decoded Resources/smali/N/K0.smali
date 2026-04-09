.class public final LN/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LTi/a;

.field private final b:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v0

    iput-object v0, p0, LN/K0;->a:LTi/a;

    const/4 v0, 0x2

    invoke-static {v2, v2, v0, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LN/K0;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final a()LN/H0;
    .locals 1

    iget-object v0, p0, LN/K0;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method
