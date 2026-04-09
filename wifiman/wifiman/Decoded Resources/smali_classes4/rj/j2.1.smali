.class public Lrj/j2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Luj/e;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Luj/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/j2;->a:Luj/e;

    iput-object p2, p0, Lrj/j2;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Luj/e;
    .locals 1

    iget-object v0, p0, Lrj/j2;->a:Luj/e;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrj/j2;->b:Ljava/lang/String;

    return-object v0
.end method
