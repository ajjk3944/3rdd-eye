.class public final synthetic Lta/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lta/g;

.field public final synthetic b:Ls9/a;

.field public final synthetic c:Landroidx/compose/ui/e;

.field public final synthetic d:Ls9/a$b;

.field public final synthetic e:Ls9/a$b;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lf0/c;

.field public final synthetic h:LC0/h;

.field public final synthetic i:F

.field public final synthetic j:Lm0/w0;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/e;->a:Lta/g;

    iput-object p2, p0, Lta/e;->b:Ls9/a;

    iput-object p3, p0, Lta/e;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lta/e;->d:Ls9/a$b;

    iput-object p5, p0, Lta/e;->e:Ls9/a$b;

    iput-object p6, p0, Lta/e;->f:Ljava/lang/String;

    iput-object p7, p0, Lta/e;->g:Lf0/c;

    iput-object p8, p0, Lta/e;->h:LC0/h;

    iput p9, p0, Lta/e;->i:F

    iput-object p10, p0, Lta/e;->j:Lm0/w0;

    iput p11, p0, Lta/e;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lta/e;->a:Lta/g;

    iget-object v1, p0, Lta/e;->b:Ls9/a;

    iget-object v2, p0, Lta/e;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lta/e;->d:Ls9/a$b;

    iget-object v4, p0, Lta/e;->e:Ls9/a$b;

    iget-object v5, p0, Lta/e;->f:Ljava/lang/String;

    iget-object v6, p0, Lta/e;->g:Lf0/c;

    iget-object v7, p0, Lta/e;->h:LC0/h;

    iget v8, p0, Lta/e;->i:F

    iget-object v9, p0, Lta/e;->j:Lm0/w0;

    iget v10, p0, Lta/e;->k:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lta/g;->b(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
