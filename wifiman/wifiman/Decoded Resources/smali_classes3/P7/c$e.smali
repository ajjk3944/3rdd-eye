.class public abstract LP7/c$e;
.super LP7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field private final a:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LP7/c;-><init>()V

    new-instance v0, LP7/d;

    invoke-direct {v0, p0}, LP7/d;-><init>(LP7/c$e;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LP7/c$e;->a:LYg/m;

    return-void
.end method

.method public static synthetic c(LP7/c$e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LP7/c$e;->f(LP7/c$e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LP7/c$e;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LP7/c$e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LP7/c$e;->e()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$e;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method
