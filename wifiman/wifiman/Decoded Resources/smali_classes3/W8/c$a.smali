.class final LW8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW8/c;-><init>(LG6/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/c$a$b;
    }
.end annotation


# static fields
.field public static final a:LW8/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/c$a;

    invoke-direct {v0}, LW8/c$a;-><init>()V

    sput-object v0, LW8/c$a;->a:LW8/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LQ6/f;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW8/c$a$c;

    invoke-direct {v0, p1}, LW8/c$a$c;-><init>(LQ6/f;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ6/f;

    invoke-virtual {p0, p1}, LW8/c$a;->a(LQ6/f;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
