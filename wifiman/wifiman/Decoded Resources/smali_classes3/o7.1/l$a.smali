.class final Lo7/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/l;-><init>(Ljava/util/List;Lgg/y;JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lgg/y;


# direct methods
.method constructor <init>(JLgg/y;)V
    .locals 0

    iput-wide p1, p0, Lo7/l$a;->a:J

    iput-object p3, p0, Lo7/l$a;->b:Lgg/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lq7/a;
    .locals 9

    new-instance v8, Lq7/a;

    iget-wide v1, p0, Lo7/l$a;->a:J

    iget-object v3, p0, Lo7/l$a;->b:Lgg/y;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lq7/a;-><init>(JLgg/y;Lgg/y;Lv7/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo7/l$a;->a()Lq7/a;

    move-result-object v0

    return-object v0
.end method
