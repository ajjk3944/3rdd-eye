.class public final synthetic LC9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LC9/i;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:LC9/h;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LC9/i;Lmh/a;LC9/h;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/q;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LC9/q;->b:LC9/i;

    iput-object p3, p0, LC9/q;->c:Lmh/a;

    iput-object p4, p0, LC9/q;->d:LC9/h;

    iput p5, p0, LC9/q;->e:I

    iput p6, p0, LC9/q;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LC9/q;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LC9/q;->b:LC9/i;

    iget-object v2, p0, LC9/q;->c:Lmh/a;

    iget-object v3, p0, LC9/q;->d:LC9/h;

    iget v4, p0, LC9/q;->e:I

    iget v5, p0, LC9/q;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LC9/s;->e(Landroidx/compose/ui/e;LC9/i;Lmh/a;LC9/h;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
