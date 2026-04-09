.class public final synthetic LS6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Lf0/c;

.field public final synthetic d:LC0/h;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lm0/w0;

.field public final synthetic g:F

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/e;Lf0/c;LC0/h;Ljava/lang/String;Lm0/w0;FII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/f;->a:Ljava/lang/Object;

    iput-object p2, p0, LS6/f;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LS6/f;->c:Lf0/c;

    iput-object p4, p0, LS6/f;->d:LC0/h;

    iput-object p5, p0, LS6/f;->e:Ljava/lang/String;

    iput-object p6, p0, LS6/f;->f:Lm0/w0;

    iput p7, p0, LS6/f;->g:F

    iput p8, p0, LS6/f;->h:I

    iput p9, p0, LS6/f;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LS6/f;->a:Ljava/lang/Object;

    iget-object v1, p0, LS6/f;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LS6/f;->c:Lf0/c;

    iget-object v3, p0, LS6/f;->d:LC0/h;

    iget-object v4, p0, LS6/f;->e:Ljava/lang/String;

    iget-object v5, p0, LS6/f;->f:Lm0/w0;

    iget v6, p0, LS6/f;->g:F

    iget v7, p0, LS6/f;->h:I

    iget v8, p0, LS6/f;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, LS6/g;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lf0/c;LC0/h;Ljava/lang/String;Lm0/w0;FIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
