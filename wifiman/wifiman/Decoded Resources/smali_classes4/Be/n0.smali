.class public final LBe/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LBe/n0;->a:LT/q0;

    return-void
.end method


# virtual methods
.method public final a()LT/z1;
    .locals 1

    iget-object v0, p0, LBe/n0;->a:LT/q0;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, LBe/n0;->a:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
