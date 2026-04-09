.class final LH/m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/m;->b(Ljava/lang/String;JLT/l;II)LH/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J


# direct methods
.method constructor <init>(Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, LH/m$a;->a:Ljava/lang/String;

    iput-wide p2, p0, LH/m$a;->b:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LH/l;
    .locals 5

    new-instance v0, LH/l;

    iget-object v1, p0, LH/m$a;->a:Ljava/lang/String;

    iget-wide v2, p0, LH/m$a;->b:J

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LH/l;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/m$a;->a()LH/l;

    move-result-object v0

    return-object v0
.end method
