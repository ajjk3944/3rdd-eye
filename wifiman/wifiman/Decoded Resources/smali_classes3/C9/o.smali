.class public final synthetic LC9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LC9/i;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:LC9/h;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LC9/i;Lmh/a;Lmh/a;ZZLC9/h;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/o;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LC9/o;->b:LC9/i;

    iput-object p3, p0, LC9/o;->c:Lmh/a;

    iput-object p4, p0, LC9/o;->d:Lmh/a;

    iput-boolean p5, p0, LC9/o;->e:Z

    iput-boolean p6, p0, LC9/o;->f:Z

    iput-object p7, p0, LC9/o;->g:LC9/h;

    iput p8, p0, LC9/o;->h:I

    iput p9, p0, LC9/o;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LC9/o;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LC9/o;->b:LC9/i;

    iget-object v2, p0, LC9/o;->c:Lmh/a;

    iget-object v3, p0, LC9/o;->d:Lmh/a;

    iget-boolean v4, p0, LC9/o;->e:Z

    iget-boolean v5, p0, LC9/o;->f:Z

    iget-object v6, p0, LC9/o;->g:LC9/h;

    iget v7, p0, LC9/o;->h:I

    iget v8, p0, LC9/o;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, LC9/s;->a(Landroidx/compose/ui/e;LC9/i;Lmh/a;Lmh/a;ZZLC9/h;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
