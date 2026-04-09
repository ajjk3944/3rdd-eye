.class LDh/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/a;-><init>(Loi/n;LZh/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/a;


# direct methods
.method constructor <init>(LDh/a;)V
    .locals 0

    iput-object p1, p0, LDh/a$a;->a:LDh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpi/d0;
    .locals 3

    iget-object v0, p0, LDh/a$a;->a:LDh/a;

    invoke-virtual {v0}, LDh/a;->E0()Lii/k;

    move-result-object v1

    new-instance v2, LDh/a$a$a;

    invoke-direct {v2, p0}, LDh/a$a$a;-><init>(LDh/a$a;)V

    invoke-static {v0, v1, v2}, Lpi/J0;->u(LBh/h;Lii/k;Lmh/l;)Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/a$a;->a()Lpi/d0;

    move-result-object v0

    return-object v0
.end method
