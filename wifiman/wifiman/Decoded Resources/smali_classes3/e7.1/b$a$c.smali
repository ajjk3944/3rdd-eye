.class final Le7/b$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/b$a;->b(Landroid/content/Context;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Le7/b$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/b$a$c;

    invoke-direct {v0}, Le7/b$a$c;-><init>()V

    sput-object v0, Le7/b$a$c;->a:Le7/b$a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 4

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {p1, v2, v3, v0, v1}, Lgg/i;->S(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, Le7/b$a$c;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
