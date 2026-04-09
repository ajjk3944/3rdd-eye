.class public final synthetic Ly9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ly9/f;

.field public final synthetic b:J

.field public final synthetic c:Landroidx/compose/ui/window/i;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/p;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/r;->a:Ly9/f;

    iput-wide p2, p0, Ly9/r;->b:J

    iput-object p4, p0, Ly9/r;->c:Landroidx/compose/ui/window/i;

    iput-object p5, p0, Ly9/r;->d:Lmh/a;

    iput-object p6, p0, Ly9/r;->e:Lmh/p;

    iput p7, p0, Ly9/r;->f:I

    iput p8, p0, Ly9/r;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Ly9/r;->a:Ly9/f;

    iget-wide v1, p0, Ly9/r;->b:J

    iget-object v3, p0, Ly9/r;->c:Landroidx/compose/ui/window/i;

    iget-object v4, p0, Ly9/r;->d:Lmh/a;

    iget-object v5, p0, Ly9/r;->e:Lmh/p;

    iget v6, p0, Ly9/r;->f:I

    iget v7, p0, Ly9/r;->g:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Ly9/s;->a(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
