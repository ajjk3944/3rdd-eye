.class final LI/i1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/i1$c$b;
    }
.end annotation


# static fields
.field public static final e:LI/i1$c$b;

.field private static final f:LT/n1;


# instance fields
.field private final a:LI/o1;

.field private final b:LL0/U;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/i1$c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/i1$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/i1$c;->e:LI/i1$c$b;

    new-instance v0, LI/i1$c$a;

    invoke-direct {v0}, LI/i1$c$a;-><init>()V

    sput-object v0, LI/i1$c;->f:LT/n1;

    return-void
.end method

.method public constructor <init>(LI/o1;LL0/U;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/i1$c;->a:LI/o1;

    iput-object p2, p0, LI/i1$c;->b:LL0/U;

    iput-boolean p3, p0, LI/i1$c;->c:Z

    iput-boolean p4, p0, LI/i1$c;->d:Z

    return-void
.end method

.method public static final synthetic a()LT/n1;
    .locals 1

    sget-object v0, LI/i1$c;->f:LT/n1;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LI/i1$c;->c:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LI/i1$c;->d:Z

    return v0
.end method

.method public final d()LI/o1;
    .locals 1

    iget-object v0, p0, LI/i1$c;->a:LI/o1;

    return-object v0
.end method

.method public final e()LL0/U;
    .locals 1

    iget-object v0, p0, LI/i1$c;->b:LL0/U;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NonMeasureInputs(textFieldState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$c;->a:LI/o1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$c;->b:LL0/U;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", singleLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LI/i1$c;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", softWrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LI/i1$c;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
