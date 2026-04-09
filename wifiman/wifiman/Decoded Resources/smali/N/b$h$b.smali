.class public final LN/b$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b$h;-><init>(LN/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 0

    iput-object p1, p0, LN/b$h$b;->a:LN/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 4

    iget-object v0, p0, LN/b$h$b;->a:LN/b;

    invoke-static {v0}, LN/b;->c(LN/b;)LN/a;

    move-result-object v0

    iget-object v1, p0, LN/b$h$b;->a:LN/b;

    invoke-virtual {v1, p1}, LN/b;->z(F)F

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LN/a;->b(LN/a;FFILjava/lang/Object;)V

    return-void
.end method
