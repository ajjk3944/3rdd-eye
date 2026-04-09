.class public final synthetic LL9/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;IIJLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/S;->a:Landroidx/compose/ui/e;

    iput p2, p0, LL9/S;->b:I

    iput p3, p0, LL9/S;->c:I

    iput-wide p4, p0, LL9/S;->d:J

    iput-object p6, p0, LL9/S;->e:Ljava/lang/String;

    iput p7, p0, LL9/S;->f:I

    iput p8, p0, LL9/S;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LL9/S;->a:Landroidx/compose/ui/e;

    iget v1, p0, LL9/S;->b:I

    iget v2, p0, LL9/S;->c:I

    iget-wide v3, p0, LL9/S;->d:J

    iget-object v5, p0, LL9/S;->e:Ljava/lang/String;

    iget v6, p0, LL9/S;->f:I

    iget v7, p0, LL9/S;->g:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LL9/T;->a(Landroidx/compose/ui/e;IIJLjava/lang/String;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
