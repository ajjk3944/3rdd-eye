.class public final synthetic LTe/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:LL0/U;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LL0/d;LL0/U;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/n0;->a:LL0/d;

    iput-object p2, p0, LTe/n0;->b:LL0/U;

    iput-wide p3, p0, LTe/n0;->c:J

    iput p5, p0, LTe/n0;->d:I

    iput p6, p0, LTe/n0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LTe/n0;->a:LL0/d;

    iget-object v1, p0, LTe/n0;->b:LL0/U;

    iget-wide v2, p0, LTe/n0;->c:J

    iget v4, p0, LTe/n0;->d:I

    iget v5, p0, LTe/n0;->e:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LTe/w0;->e(LL0/d;LL0/U;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
