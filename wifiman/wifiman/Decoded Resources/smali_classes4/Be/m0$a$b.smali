.class public final LBe/m0$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/m0$a;->f(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBe/n0;


# direct methods
.method public constructor <init>(LBe/n0;)V
    .locals 0

    iput-object p1, p0, LBe/m0$a$b;->a:LBe/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LBe/m0$a$b;->a:LBe/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LBe/n0;->b(Z)V

    return-void
.end method
