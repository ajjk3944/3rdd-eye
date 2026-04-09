.class public abstract LBh/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z


# direct methods
.method protected constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/w0;->a:Ljava/lang/String;

    iput-boolean p2, p0, LBh/w0;->b:Z

    return-void
.end method


# virtual methods
.method public a(LBh/w0;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LBh/v0;->a:LBh/v0;

    invoke-virtual {v0, p0, p1}, LBh/v0;->a(LBh/w0;LBh/w0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBh/w0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LBh/w0;->b:Z

    return v0
.end method

.method public d()LBh/w0;
    .locals 0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LBh/w0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
