.class public final synthetic Lrf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lrf/A;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lrf/A;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/g;->a:Lrf/A;

    iput-wide p2, p0, Lrf/g;->b:J

    iput p4, p0, Lrf/g;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lrf/g;->a:Lrf/A;

    iget-wide v1, p0, Lrf/g;->b:J

    iget v3, p0, Lrf/g;->c:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lrf/j;->a(Lrf/A;JILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
