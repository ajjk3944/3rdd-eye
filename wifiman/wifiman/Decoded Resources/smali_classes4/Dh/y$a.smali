.class LDh/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/y;->K0()Lpi/G0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/y;


# direct methods
.method constructor <init>(LDh/y;)V
    .locals 0

    iput-object p1, p0, LDh/y$a;->a:LDh/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/l0;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p1}, LBh/l0;->m0()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/l0;

    invoke-virtual {p0, p1}, LDh/y$a;->a(LBh/l0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
