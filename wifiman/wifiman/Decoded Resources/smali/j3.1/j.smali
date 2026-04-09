.class public final synthetic Lj3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Lj3/r;

.field public final synthetic b:Lc3/p;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lj3/r;Lc3/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/j;->a:Lj3/r;

    iput-object p2, p0, Lj3/j;->b:Lc3/p;

    iput p3, p0, Lj3/j;->c:I

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj3/j;->a:Lj3/r;

    iget-object v1, p0, Lj3/j;->b:Lc3/p;

    iget v2, p0, Lj3/j;->c:I

    invoke-static {v0, v1, v2}, Lj3/r;->f(Lj3/r;Lc3/p;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
