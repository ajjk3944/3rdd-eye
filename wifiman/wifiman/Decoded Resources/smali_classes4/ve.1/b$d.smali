.class final Lve/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lve/b;->a(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lve/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lve/b$d;

    invoke-direct {v0}, Lve/b$d;-><init>()V

    sput-object v0, Lve/b$d;->a:Lve/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lve/b$d$a;

    invoke-direct {p1}, Lve/b$d$a;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lve/b$d;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
