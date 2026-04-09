.class final Lmc/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmc/b$d;->a(Ljava/lang/Throwable;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lmc/b$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmc/b$d$a;

    invoke-direct {v0}, Lmc/b$d$a;-><init>()V

    sput-object v0, Lmc/b$d$a;->a:Lmc/b$d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lld/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lld/a;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lld/a;

    invoke-virtual {p0, p1}, Lmc/b$d$a;->a(Lld/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
