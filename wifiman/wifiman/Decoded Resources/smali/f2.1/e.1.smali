.class public final Lf2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lf2/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lf2/h;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argument"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lf2/e;->b:Lf2/h;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lf2/h;
    .locals 1

    iget-object v0, p0, Lf2/e;->b:Lf2/h;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/e;->a:Ljava/lang/String;

    return-object v0
.end method
