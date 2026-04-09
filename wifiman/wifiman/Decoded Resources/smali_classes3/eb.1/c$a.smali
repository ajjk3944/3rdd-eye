.class final Leb/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;->j()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$a;

    invoke-direct {v0}, Leb/c$a;-><init>()V

    sput-object v0, Leb/c$a;->a:Leb/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/k;)Lgb/b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgb/k;->g()Lgb/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgb/k;

    invoke-virtual {p0, p1}, Leb/c$a;->a(Lgb/k;)Lgb/b;

    move-result-object p1

    return-object p1
.end method
