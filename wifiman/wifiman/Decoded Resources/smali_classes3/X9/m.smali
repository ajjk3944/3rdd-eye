.class public final synthetic LX9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LX9/p;

.field public final synthetic b:Lu9/d;

.field public final synthetic c:Z

.field public final synthetic d:LCi/e;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(LX9/p;Lu9/d;ZLCi/e;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/m;->a:LX9/p;

    iput-object p2, p0, LX9/m;->b:Lu9/d;

    iput-boolean p3, p0, LX9/m;->c:Z

    iput-object p4, p0, LX9/m;->d:LCi/e;

    iput p5, p0, LX9/m;->e:I

    iput p6, p0, LX9/m;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LX9/m;->a:LX9/p;

    iget-object v1, p0, LX9/m;->b:Lu9/d;

    iget-boolean v2, p0, LX9/m;->c:Z

    iget-object v3, p0, LX9/m;->d:LCi/e;

    iget v4, p0, LX9/m;->e:I

    iget v5, p0, LX9/m;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LX9/o;->a(LX9/p;Lu9/d;ZLCi/e;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
