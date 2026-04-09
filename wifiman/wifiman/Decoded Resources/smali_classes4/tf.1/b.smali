.class public final synthetic Ltf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lra/d;

.field public final synthetic c:Lmh/p;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(ZLra/d;Lmh/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ltf/b;->a:Z

    iput-object p2, p0, Ltf/b;->b:Lra/d;

    iput-object p3, p0, Ltf/b;->c:Lmh/p;

    iput p4, p0, Ltf/b;->d:I

    iput p5, p0, Ltf/b;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-boolean v0, p0, Ltf/b;->a:Z

    iget-object v1, p0, Ltf/b;->b:Lra/d;

    iget-object v2, p0, Ltf/b;->c:Lmh/p;

    iget v3, p0, Ltf/b;->d:I

    iget v4, p0, Ltf/b;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Ltf/c;->a(ZLra/d;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
