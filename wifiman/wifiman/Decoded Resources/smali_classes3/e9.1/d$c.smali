.class final Le9/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d;-><init>(LT8/d;Le9/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Le9/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le9/d$c;

    invoke-direct {v0}, Le9/d$c;-><init>()V

    sput-object v0, Le9/d$c;->a:Le9/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le9/c$b;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/d$c$a;

    invoke-direct {v0, p1}, Le9/d$c$a;-><init>(Le9/c$b;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le9/c$b;

    invoke-virtual {p0, p1}, Le9/d$c;->a(Le9/c$b;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
