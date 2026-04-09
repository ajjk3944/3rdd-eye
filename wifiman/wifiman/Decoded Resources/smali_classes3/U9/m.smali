.class public final synthetic LU9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lf2/w;

.field public final synthetic d:LN/n0;

.field public final synthetic e:LU9/h;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/m;->a:Landroid/app/Activity;

    iput-object p2, p0, LU9/m;->b:Ljava/lang/String;

    iput-object p3, p0, LU9/m;->c:Lf2/w;

    iput-object p4, p0, LU9/m;->d:LN/n0;

    iput-object p5, p0, LU9/m;->e:LU9/h;

    iput p6, p0, LU9/m;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LU9/m;->a:Landroid/app/Activity;

    iget-object v1, p0, LU9/m;->b:Ljava/lang/String;

    iget-object v2, p0, LU9/m;->c:Lf2/w;

    iget-object v3, p0, LU9/m;->d:LN/n0;

    iget-object v4, p0, LU9/m;->e:LU9/h;

    iget v5, p0, LU9/m;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LU9/y;->m(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
