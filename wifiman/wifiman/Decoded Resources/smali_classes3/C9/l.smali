.class public final synthetic LC9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LC9/i;

.field public final synthetic c:Z

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/a;

.field public final synthetic f:LC9/h;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LC9/i;ZLmh/a;Lmh/a;LC9/h;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/l;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LC9/l;->b:LC9/i;

    iput-boolean p3, p0, LC9/l;->c:Z

    iput-object p4, p0, LC9/l;->d:Lmh/a;

    iput-object p5, p0, LC9/l;->e:Lmh/a;

    iput-object p6, p0, LC9/l;->f:LC9/h;

    iput p7, p0, LC9/l;->g:I

    iput p8, p0, LC9/l;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LC9/l;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LC9/l;->b:LC9/i;

    iget-boolean v2, p0, LC9/l;->c:Z

    iget-object v3, p0, LC9/l;->d:Lmh/a;

    iget-object v4, p0, LC9/l;->e:Lmh/a;

    iget-object v5, p0, LC9/l;->f:LC9/h;

    iget v6, p0, LC9/l;->g:I

    iget v7, p0, LC9/l;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LC9/s;->h(Landroidx/compose/ui/e;LC9/i;ZLmh/a;Lmh/a;LC9/h;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
