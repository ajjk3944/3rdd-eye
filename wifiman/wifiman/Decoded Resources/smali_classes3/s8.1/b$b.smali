.class final Ls8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b;->s0(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls8/b$b;

    invoke-direct {v0}, Ls8/b$b;-><init>()V

    sput-object v0, Ls8/b$b;->a:Ls8/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LGe/g;)LDj/a;
    .locals 4

    const-string/jumbo v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls8/b$a$a;

    invoke-direct {v0, p1}, Ls8/b$a$a;-><init>(LGe/g;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0xfa0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v1

    new-instance v2, Ls8/b$b$a;

    invoke-direct {v2, p1}, Ls8/b$b$a;-><init>(LGe/g;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lgg/i;->Q0(LDj/a;LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGe/g;

    invoke-virtual {p0, p1}, Ls8/b$b;->a(LGe/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
