.class public final synthetic Lta/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/a;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Ls9/a$b;

.field public final synthetic d:Ls9/a$b;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lf0/c;

.field public final synthetic g:LC0/h;

.field public final synthetic h:F

.field public final synthetic i:Lm0/w0;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/a;->a:Ls9/a;

    iput-object p2, p0, Lta/a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Lta/a;->c:Ls9/a$b;

    iput-object p4, p0, Lta/a;->d:Ls9/a$b;

    iput-object p5, p0, Lta/a;->e:Ljava/lang/String;

    iput-object p6, p0, Lta/a;->f:Lf0/c;

    iput-object p7, p0, Lta/a;->g:LC0/h;

    iput p8, p0, Lta/a;->h:F

    iput-object p9, p0, Lta/a;->i:Lm0/w0;

    iput p10, p0, Lta/a;->j:I

    iput p11, p0, Lta/a;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lta/a;->a:Ls9/a;

    iget-object v1, p0, Lta/a;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lta/a;->c:Ls9/a$b;

    iget-object v3, p0, Lta/a;->d:Ls9/a$b;

    iget-object v4, p0, Lta/a;->e:Ljava/lang/String;

    iget-object v5, p0, Lta/a;->f:Lf0/c;

    iget-object v6, p0, Lta/a;->g:LC0/h;

    iget v7, p0, Lta/a;->h:F

    iget-object v8, p0, Lta/a;->i:Lm0/w0;

    iget v9, p0, Lta/a;->j:I

    iget v10, p0, Lta/a;->k:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lta/c;->a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
