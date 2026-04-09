.class public final synthetic LV6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LS6/r;

.field public final synthetic c:LS6/k;

.field public final synthetic d:LS6/r;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(JLS6/r;LS6/k;LS6/r;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LV6/i;->a:J

    iput-object p3, p0, LV6/i;->b:LS6/r;

    iput-object p4, p0, LV6/i;->c:LS6/k;

    iput-object p5, p0, LV6/i;->d:LS6/r;

    iput p6, p0, LV6/i;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-wide v0, p0, LV6/i;->a:J

    iget-object v2, p0, LV6/i;->b:LS6/r;

    iget-object v3, p0, LV6/i;->c:LS6/k;

    iget-object v4, p0, LV6/i;->d:LS6/r;

    iget v5, p0, LV6/i;->e:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LV6/m;->c(JLS6/r;LS6/k;LS6/r;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
