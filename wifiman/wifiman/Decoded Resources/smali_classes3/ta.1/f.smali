.class public final synthetic Lta/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lta/g;

.field public final synthetic b:Ls9/a$b;

.field public final synthetic c:Landroidx/compose/ui/e;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lf0/c;

.field public final synthetic f:LC0/h;

.field public final synthetic g:F

.field public final synthetic h:Lm0/w0;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/f;->a:Lta/g;

    iput-object p2, p0, Lta/f;->b:Ls9/a$b;

    iput-object p3, p0, Lta/f;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lta/f;->d:Ljava/lang/String;

    iput-object p5, p0, Lta/f;->e:Lf0/c;

    iput-object p6, p0, Lta/f;->f:LC0/h;

    iput p7, p0, Lta/f;->g:F

    iput-object p8, p0, Lta/f;->h:Lm0/w0;

    iput p9, p0, Lta/f;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lta/f;->a:Lta/g;

    iget-object v1, p0, Lta/f;->b:Ls9/a$b;

    iget-object v2, p0, Lta/f;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lta/f;->d:Ljava/lang/String;

    iget-object v4, p0, Lta/f;->e:Lf0/c;

    iget-object v5, p0, Lta/f;->f:LC0/h;

    iget v6, p0, Lta/f;->g:F

    iget-object v7, p0, Lta/f;->h:Lm0/w0;

    iget v8, p0, Lta/f;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lta/g;->c(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
