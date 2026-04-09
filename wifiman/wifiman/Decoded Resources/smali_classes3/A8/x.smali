.class public final synthetic LA8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LA8/z;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LA8/z;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8/x;->a:LA8/z;

    iput-object p2, p0, LA8/x;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LA8/x;->a:LA8/z;

    iget-object v1, p0, LA8/x;->b:Ljava/util/List;

    check-cast p1, Lod/i;

    invoke-static {v0, v1, p1}, LA8/z;->a0(LA8/z;Ljava/util/List;Lod/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
