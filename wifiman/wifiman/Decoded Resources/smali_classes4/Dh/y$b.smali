.class LDh/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/y;->z0()LBh/q0;
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

    iput-object p1, p0, LDh/y$b;->a:LDh/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpi/d0;)Lpi/d0;
    .locals 1

    iget-object v0, p0, LDh/y$b;->a:LDh/y;

    invoke-static {v0, p1}, LDh/y;->G0(LDh/y;Lpi/d0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpi/d0;

    invoke-virtual {p0, p1}, LDh/y$b;->a(Lpi/d0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
