.class public final Lo7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo7/f$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lu7/b;I)Lo7/f$a;
    .locals 2

    const-string/jumbo v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/f$a;->a:Ljava/util/List;

    new-instance v1, Lo7/p;

    invoke-direct {v1, p1, p2}, Lo7/p;-><init>(Lu7/b;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()Lo7/f;
    .locals 9

    new-instance v8, Lo7/l;

    iget-object v1, p0, Lo7/f$a;->a:Ljava/util/List;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lo7/l;-><init>(Ljava/util/List;Lgg/y;JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method
