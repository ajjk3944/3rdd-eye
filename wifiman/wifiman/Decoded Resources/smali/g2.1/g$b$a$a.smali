.class public final Lg2/g$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g$b$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg2/i;

.field final synthetic b:Lf2/k;

.field final synthetic c:Landroidx/compose/runtime/snapshots/k;


# direct methods
.method public constructor <init>(Lg2/i;Lf2/k;Landroidx/compose/runtime/snapshots/k;)V
    .locals 0

    iput-object p1, p0, Lg2/g$b$a$a;->a:Lg2/i;

    iput-object p2, p0, Lg2/g$b$a$a;->b:Lf2/k;

    iput-object p3, p0, Lg2/g$b$a$a;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lg2/g$b$a$a;->a:Lg2/i;

    iget-object v1, p0, Lg2/g$b$a$a;->b:Lf2/k;

    invoke-virtual {v0, v1}, Lg2/i;->p(Lf2/k;)V

    iget-object v0, p0, Lg2/g$b$a$a;->c:Landroidx/compose/runtime/snapshots/k;

    iget-object v1, p0, Lg2/g$b$a$a;->b:Lf2/k;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/k;->remove(Ljava/lang/Object;)Z

    return-void
.end method
