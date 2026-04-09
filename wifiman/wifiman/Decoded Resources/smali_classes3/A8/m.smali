.class public final synthetic LA8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lgg/j;

.field public final synthetic b:LA8/o;


# direct methods
.method public synthetic constructor <init>(Lgg/j;LA8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8/m;->a:Lgg/j;

    iput-object p2, p0, LA8/m;->b:LA8/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LA8/m;->a:Lgg/j;

    iget-object v1, p0, LA8/m;->b:LA8/o;

    invoke-static {v0, v1}, LA8/o;->I0(Lgg/j;LA8/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
