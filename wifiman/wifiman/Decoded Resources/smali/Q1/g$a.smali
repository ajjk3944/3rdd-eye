.class public final LQ1/g$a;
.super Landroidx/datastore/preferences/protobuf/v$a;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, LQ1/g;->G()LQ1/g;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/v$a;-><init>(Landroidx/datastore/preferences/protobuf/v;)V

    return-void
.end method

.method synthetic constructor <init>(LQ1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LQ1/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public x(Ljava/lang/Iterable;)LQ1/g$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->q()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    check-cast v0, LQ1/g;

    invoke-static {v0, p1}, LQ1/g;->H(LQ1/g;Ljava/lang/Iterable;)V

    return-object p0
.end method
